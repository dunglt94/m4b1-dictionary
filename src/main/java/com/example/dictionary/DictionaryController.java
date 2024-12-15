package com.example.dictionary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DictionaryController {
    @GetMapping("/dictionaries")
    public ModelAndView dictionary() {
        return new ModelAndView("dictionary");
    }

    @PostMapping("/dictionaries")
    public ModelAndView translate(@RequestParam String word) {
        ModelAndView mav = new ModelAndView("dictionary");
        String meaning = "Nghĩa không tìm thấy.";
        if ("hello".equalsIgnoreCase(word)) {
            meaning = "xin chào";
        } else if ("world".equalsIgnoreCase(word)) {
            meaning = "thế giới";
        }
        mav.addObject("word", word);
        mav.addObject("meaning", meaning);
        return mav;
    }
}
