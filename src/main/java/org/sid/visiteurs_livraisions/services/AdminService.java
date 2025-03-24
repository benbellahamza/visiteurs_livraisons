package org.sid.visiteurs_livraisions.services;

import org.sid.visiteurs_livraisions.dtos.AdminDTO;
import org.sid.visiteurs_livraisions.entities.Admin;
import org.sid.visiteurs_livraisions.mappers.AdminMapper;
import org.sid.visiteurs_livraisions.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private AdminMapper adminMapper;

    public AdminDTO createAdmin(AdminDTO adminDTO) {
        Admin admin = adminMapper.toEntity(adminDTO);
        admin = adminRepository.save(admin);
        return adminMapper.toDto(admin);
    }

    public List<AdminDTO> getList() {
        List<Admin> admins = adminRepository.findAll();
        List<AdminDTO> adminDTOs = new ArrayList<>();
        for (Admin admin : admins) {
            adminDTOs.add(adminMapper.toDto(admin));
        }
        return adminDTOs;
    }
}
