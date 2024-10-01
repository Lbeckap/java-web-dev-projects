package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String renderHomePage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol><li>Java</li><li>JavaScript</li><li>Python</li></ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String displayForm() {
        return "<html>" +
                "<body>" +
                "<form method='POST' action='/form'>" +
                //Name
                "<label>Name:</label>" +
                "<br>" +
                "<input type='text' name='name'><br>" +
                //1st Favorite
                "<label>My favorite language:</label>" +
                "<br>" +
                "<select name='firstFavoriteLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
               //2nd favorite
                "<label>My second favorite language:</label>" +
                "<br>" +
                "<select name='secondFavoriteLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                //3rd favorite
                "<label>My third favorite language:</label>" +
                "<br>" +
                "<select name='thirdFavoriteLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<input type='submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/form")
    public String onSubmit(@RequestParam String name,
                           @RequestParam String firstFavoriteLanguage,
                           @RequestParam String secondFavoriteLanguage,
                           @RequestParam String thirdFavoriteLanguage) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol><li>" + firstFavoriteLanguage + "</li>" +
                "<li>" + secondFavoriteLanguage + "</li>" +
                "<li>" + thirdFavoriteLanguage + "</li></ol>" +
                "</body>" +
                "</html>";


    }
}
