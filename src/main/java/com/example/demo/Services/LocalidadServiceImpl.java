package com.example.demo.Services;

import com.example.demo.Entities.Localidad;
import com.example.demo.Repositories.BaseRepository;
import com.example.demo.Repositories.LocalidadRepository;
import com.example.demo.Repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    @Autowired
    private LocalidadRepository localidadRepository;
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {

        super(baseRepository);
    }
}
