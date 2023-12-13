package com.example.btl_ttcsn.service.serviceImpl;

import com.example.btl_ttcsn.dto.request.LocationCreateRequestDTO;
import com.example.btl_ttcsn.dto.response.LocationCreateResponseDTO;
import com.example.btl_ttcsn.dto.response.ProjectCreateResponseDTO;
import com.example.btl_ttcsn.entity.Location;
import com.example.btl_ttcsn.entity.Project;
import com.example.btl_ttcsn.exception.NotFoundException;
import com.example.btl_ttcsn.repository.LocationRepository;
import com.example.btl_ttcsn.repository.ProjectRepository;
import com.example.btl_ttcsn.service.LocationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    LocationRepository locationRepository;
    @Autowired
    ProjectRepository projectRepository;
    @Override
    public LocationCreateResponseDTO create(LocationCreateRequestDTO locationCreateRequestDTO) {
        Location location=modelMapper.map(locationCreateRequestDTO,Location.class);
        locationRepository.save(location);
        return modelMapper.map(location,LocationCreateResponseDTO.class);
    }

    @Override
    public LocationCreateResponseDTO update(LocationCreateResponseDTO locationCreateResponseDTO) {
        Location location=modelMapper.map(locationCreateResponseDTO,Location.class);
        locationRepository.save(location);
        return modelMapper.map(location,LocationCreateResponseDTO.class);
    }

    @Override
    public LocationCreateResponseDTO findById(Long id) {
        Location location= locationRepository.findById(id).get();
        return modelMapper.map(location,LocationCreateResponseDTO.class);
    }

    @Override
    public LocationCreateResponseDTO addProject(Long idLocation, Long idProduct) {
        Location location=locationRepository.findById(idLocation).orElse(null);
        Project project=projectRepository.findById(idProduct).orElse(null);
        if(project==null){
            throw new NotFoundException("Not Found ID Project!");
        }
        if(location==null){
            throw new NotFoundException("Not Found ID Location");
        }
        location.setProject(project);
        locationRepository.save(location);
        return modelMapper.map(location,LocationCreateResponseDTO.class);
    }

    @Override
    public void remove(Long id) {
        locationRepository.deleteById(id);
    }

    @Override
    public List<LocationCreateResponseDTO> findAll() {
        List<Location> projects=locationRepository.findAll();
        List<LocationCreateResponseDTO> list=new ArrayList<>();
        for(Location x:projects){
                list.add(modelMapper.map(x,LocationCreateResponseDTO.class));
            }
        return list;
    }
}
