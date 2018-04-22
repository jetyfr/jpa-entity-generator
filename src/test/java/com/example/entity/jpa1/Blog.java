package com.example.entity.jpa1;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * Note: auto-generated by jpa-entity-generator
 */
@Data
@ToString
@Builder(toBuilder = true)
@Entity(name = "com.example.entity.jpa1.Blog")
@Table(name = "blog")
public class Blog implements Serializable {

  @Id
  @GeneratedValue
  @Column(name = "`id`")
  private Integer id;
  @Column(name = "`name`")
  private String name = "Anonymous";
  @Column(name = "`active`")
  private boolean active;
  @Column(name = "`created_at`")
  private Timestamp createdAt;
}