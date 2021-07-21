package com.dio.live.controller;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping //atualiza um dado ja existente
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping // busca todoss
    public List<JornadaTrabalho> getJornada(){
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}") // busca por id
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(()-> new NoSuchElementException("Jornada não encontrada")));
    }

    @PutMapping //criar algo
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.updateJornada(jornadaTrabalho);
    }
    @DeleteMapping("/{idJornada}") // busca por id
    public ResponseEntity deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {
        try{
        jornadaService.deleteId(idJornada);}
        catch (Exception e){
            System.out.println(e.getMessage());
            }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }
}
