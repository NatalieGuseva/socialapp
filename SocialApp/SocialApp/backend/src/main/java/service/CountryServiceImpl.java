package service;



import entity.Country;
import java.lang.ClassNotFoundException;
//import .exception.CountryNotFoundException;
import repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    @Override
    public Country getCountryById(Long id) {
        return countryRepository.findById(id).orElseThrow();
    }

    @Override
    public Country getCountryByName(String name) {
        return countryRepository.findByName(name).orElseThrow();
    }

    @Override
    public List<Country> getCountryList() {
        return countryRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }
}