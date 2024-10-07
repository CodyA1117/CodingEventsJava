package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
@RequestMapping("events")
public class EventController {

    private static HashMap<String, String> events = new HashMap<>();

    // Adding initial events with descriptions
    static {
        events.put("Menteaship", "A fun meetup for connecting with mentors");
        events.put("Code With Pride", "A fun meetup sponsored by LaunchCode");
        events.put("Javascripty", "An imaginary meetup for Javascript developers");
    }

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("events", events);
        model.addAttribute("title", "All Events");
        return "events/index";
    }

    @GetMapping("create")
    public String renderCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName, @RequestParam String eventDescription) {
        events.put(eventName, eventDescription);
        return "redirect:/events";
    }
}
