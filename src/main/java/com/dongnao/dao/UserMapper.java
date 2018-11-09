package com.dongnao.dao;

import com.dongnao.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User getById(Integer id);

}
