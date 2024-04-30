package lugun.arpita.productservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private int id;
    private String name;
    private String tittle;
    private String description;
    private int price;
    private String imageUrl;
}
