package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shop.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
