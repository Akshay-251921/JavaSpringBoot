
package com.example.EmployeeManagement;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class controller {

    ArrayList<model> ProductList = new ArrayList<>();

    // GET: Display all products
    @GetMapping("/GET")
    public ArrayList<model> getProductList() {
        return new ArrayList<>(ProductList);
    }

    // POST: Add a new product
    @PostMapping("/post")
    public String postProductList(@RequestBody model mod) {

        ProductList.add(new model(
                mod.getNumber(),
                mod.getName()
        ));

        return "Product added successfully!";
    }

    // DELETE: Delete only the product with matching number
    @DeleteMapping("/del/{number}")
    public String deleteProductList(@PathVariable int number) {

        for (int i = 0; i < ProductList.size(); i++) {

            if (ProductList.get(i).getNumber() == number) {

                ProductList.remove(i);

                return "Product deleted successfully!";
            }
        }

        return "Product not found!";
    }
}
