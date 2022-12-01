/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "LoaiPhong")
public class LoaiPhong {
    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String id;
    
    @Column(name = "maPhong")
    private String maPhong;
    
    @Column(name = "LoaiPhong")
    private String loaiPhong;
    
    @Column(name = "DonGia")
    private String donGia;
    
    @Column(name = "soNguoiToiDa")
    private Integer soNguoiToiDa;
    
    @OneToMany(mappedBy = "loaiPhong")
    private List<Phong> listPhong;
    
}
