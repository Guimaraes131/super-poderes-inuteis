package io.github.Guimaraes131.super_poderes_inuteis.superPoder;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SuperPoderService {

    private final SuperPoderRepository repository;

    public List<SuperPoder> index() {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "nivelInutilidade"));
    }
}
