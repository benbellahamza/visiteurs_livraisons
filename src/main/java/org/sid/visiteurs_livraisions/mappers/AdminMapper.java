package org.sid.visiteurs_livraisions.mappers;

import org.mapstruct.factory.Mappers;
import org.sid.visiteurs_livraisions.dtos.AdminDTO;
import org.sid.visiteurs_livraisions.entities.Admin;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdminMapper {
    AdminMapper INSTANCE = Mappers.getMapper(AdminMapper.class);
    AdminDTO toDto(Admin admin);
    Admin toEntity(AdminDTO adminDTO);
}
