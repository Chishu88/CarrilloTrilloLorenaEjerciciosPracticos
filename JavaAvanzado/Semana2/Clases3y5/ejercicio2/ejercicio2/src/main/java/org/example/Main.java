package org.example;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Event> events = Arrays.asList(
                new Event("evento1", LocalDate.of(2024,1,23), "Meeting"),
                new Event("evento2", LocalDate.of(2024,2,21), "Conference"),
                new Event("evento3", LocalDate.of(2024,2,20), "Workshop"),
                new Event("evento4", LocalDate.of(2024,4,10), "Meeting"),
                new Event("evento5", LocalDate.of(2024,2,20), "Conference"),
                new Event("evento6", LocalDate.of(2024,6,23), "Workshop"),
                new Event("evento7", LocalDate.of(2024,1,18), "Meeting"),
                new Event("evento8", LocalDate.of(2024,2,18), "Conference"),
                new Event("evento9", LocalDate.of(2024,2,20), "Workshop")
        );

        LocalDate specificDate = LocalDate.of(2024,02,20);
        List<Event> filterEventsForDate = events.stream()
                .filter(e -> e.getDate().equals(specificDate))
                .collect(Collectors.toList());

        System.out.println("Show events for the date: " + specificDate + ":");
        filterEventsForDate.forEach(System.out::println);
        System.out.println();

        Map<String, List<Event>> eventByCategory = events.stream()
                .collect(Collectors.groupingBy(Event::getCategory));

        Map<String, Long> countEventsByCategory = events.stream()
                        .collect(Collectors.groupingBy(Event::getCategory, Collectors.counting()));

        System.out.println("Events by category: ");
        eventByCategory.forEach((category, eventList) ->  {
            System.out.println(category + ":");
            eventList.forEach(System.out::println);
            System.out.println();
        });

        System.out.println("Counts events by category: ");
        countEventsByCategory.forEach((category, count) ->
                System.out.println(category + ":" + count));
        System.out.println();

        LocalDate currentDate = LocalDate.now();
        Optional<Event> nextEvent = events.stream()
                .filter(e -> e.getDate().isAfter(currentDate))
                .min(Comparator.comparing(Event::getDate));

        System.out.println("Next event: ");
        nextEvent.ifPresent(System.out::println);
    }
}