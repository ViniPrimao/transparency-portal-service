package com.conclusion.transparencyPortalService.mapper;

import com.conclusion.transparencyPortalService.dto.SupplyDTO;
import com.conclusion.transparencyPortalService.entity.SupplyEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface SupplyEntityMapper {
    SupplyEntity map(SupplyDTO source);

    default List<SupplyEntity> mapList(List<SupplyDTO> source) {
        return Optional.ofNullable(source)
                .orElseGet(ArrayList::new)
                .stream()
                .map(this::map)
                .collect(Collectors.toList());
    }
}
