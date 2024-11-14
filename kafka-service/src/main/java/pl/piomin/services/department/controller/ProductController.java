package pl.piomin.services.department.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pl.piomin.services.department.model.DtoPayment;
import pl.piomin.services.department.model.Product;
import pl.piomin.services.department.model.ProductUserDTO;
import pl.piomin.services.department.model.UserAccount;
import pl.piomin.services.department.repository.ProductRepository;
import pl.piomin.services.department.repository.UserAccountRepository;

@RestController
@RequestMapping("/kafka")
public class ProductController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private UserAccountRepository userAccountRepository;

	@Autowired
	private ProductRepository productRepository;


	@PostMapping
	public ResponseEntity<ProductUserDTO> payment(@RequestBody DtoPayment dtoPayment) {
		Optional<UserAccount> optionalUserAccount = userAccountRepository.findByLogin(dtoPayment.getLogin());
		if (optionalUserAccount.isPresent()) {
			UserAccount userAccount = optionalUserAccount.get();
			if(userAccount.getEmail().equals(dtoPayment.getEmail()) && userAccount.getPassword().equals(dtoPayment.getPassword())) {
				Optional<Product> productOptional = productRepository.findById(dtoPayment.getId());
				if(productOptional.isPresent()) {
					Product product = productOptional.get();
					ProductUserDTO productUserDTO = new ProductUserDTO();
					productUserDTO.setEmail(dtoPayment.getEmail());
					productUserDTO.setType(product.getType());
					productUserDTO.setSubtype(product.getSubtype());
					productUserDTO.setName(product.getName());
					productUserDTO.setCode(product.getCode());
					productUserDTO.setCarType(product.getCarType());
					productUserDTO.setCarModel(product.getCarModel());
					productUserDTO.setCarModel(product.getCarModel());
					productUserDTO.setCreator(product.getCreator());
					productUserDTO.setNumInWarehouse(product.getNumInWarehouse());
					productUserDTO.setCost(product.getCost());
					return ResponseEntity.status(HttpStatus.OK).body(productUserDTO);
				}else {
					return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
				}
			}else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ProductUserDTO());
			}
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ProductUserDTO());
		}
	}

}
