package com.example.parkinglot.controllers;

import com.example.parkinglot.dto.GenerateTicketRequestDto;
import com.example.parkinglot.dto.GenerateTicketResponseDto;
import com.example.parkinglot.models.Ticket;
import com.example.parkinglot.services.TicketService;



public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto){
        Ticket ticket = ticketService.generateTicket(
                requestDto.getVehicle(), requestDto.getEntryGate()
        );

        GenerateTicketResponseDto responseDto = new GenerateTicketResponseDto();
        responseDto.setTicket(ticket);
        return responseDto;
    }
}
