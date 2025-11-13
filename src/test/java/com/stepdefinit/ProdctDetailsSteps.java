package com.stepdefinit;

import com.Pom.ProductDetails;
import com.common.BaseClass1;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProdctDetailsSteps extends BaseClass1{

ProductDetails productdetails;

public ProdctDetailsSteps() {
        productdetails = new ProductDetails(driver);
    }

@Then("verify product option is visible")
public void verify_product_option_is_visible() {
    productdetails.ProductOptionVisible();
}
@Then("click on product option")
public void click_on_product_option() {
    productdetails.ProductOptionClick();
}
@Then("verify user is navigated to all products page")
public void verify_user_is_navigated_to_all_products_page() {
    productdetails.AllProductVisible();
}
@When("Click on View Product of first product")
public void click_on_view_product_of_first_product() {
    productdetails.FirstViewProdcutClick();
}
@Then("verify product name, price and availability")
public void verify_product_name_price_and_availability() {
   productdetails.FirstProductDetails();
   driver.quit();
}

}
