package br.com.mercadolivre.morse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/translate")
public class MorseController {

    @GetMapping("/{morse}")
    public MorsePOJO translateMorse(@PathVariable String morse) {
        String translated = MorseUtil.translate(morse);
        return new MorsePOJO(translated, morse);
//        return "Oi";
    }

}
