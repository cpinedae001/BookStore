package com.umg.Bookstore.controller;

import com.umg.Bookstore.model.Autor;
import com.umg.Bookstore.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Autor")
public class AutorController {
    @Autowired
    AutorRepository autorRepository;
    
}
