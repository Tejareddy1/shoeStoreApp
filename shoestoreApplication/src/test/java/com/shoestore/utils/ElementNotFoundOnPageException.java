package com.shoestore.utils;

/**
 * Created by tejeshr on 5/4/17.
 */
public class ElementNotFoundOnPageException extends RuntimeException {

        public ElementNotFoundOnPageException(Exception e) {
            super("Tried to Identify the element and the element not found on the page" +e.getMessage());
        }
}
