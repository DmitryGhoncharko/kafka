import org.junit.jupiter.api.Test;
import pl.piomin.services.organization.model.Product;

import static org.assertj.core.api.Assertions.assertThat;

class ProductTest {

    @Test
    void testProductGettersAndSetters() {
        Product product = new Product();
        product.setId(1L);
        product.setType("Type1");
        product.setSubtype("Subtype1");
        product.setName("Product Name");
        product.setCode(12345);
        product.setCarType("SUV");
        product.setCarSeries("Series1");
        product.setCarModel("ModelX");
        product.setCarModification("Modification1");
        product.setCreator("Creator1");
        product.setNumInWarehouse(50);
        product.setCost(1000.50f);
        assertThat(product.getId()).isEqualTo(1L);
        assertThat(product.getType()).isEqualTo("Type1");
        assertThat(product.getSubtype()).isEqualTo("Subtype1");
        assertThat(product.getName()).isEqualTo("Product Name");
        assertThat(product.getCode()).isEqualTo(12345);
        assertThat(product.getCarType()).isEqualTo("SUV");
        assertThat(product.getCarSeries()).isEqualTo("Series1");
        assertThat(product.getCarModel()).isEqualTo("ModelX");
        assertThat(product.getCarModification()).isEqualTo("Modification1");
        assertThat(product.getCreator()).isEqualTo("Creator1");
        assertThat(product.getNumInWarehouse()).isEqualTo(50);
        assertThat(product.getCost()).isEqualTo(1000.50f);
    }

    @Test
    void testProductConstructor() {
        Product product = new Product();
        assertThat(product).isNotNull();
    }
}
