package com.example.zwigato.controller;

import com.example.zwigato.service.MenuItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/menuItem")
@RequiredArgsConstructor
public class MenuItemController {

    private final MenuItemService menuItemService;

    public ResponseEntity addMenuItem(@RequestParam int rest, @RequestBody MenuItemRequest menuItemRequest){
        menuItemService.addMenuItem(menuItemRequest);
    }
}
