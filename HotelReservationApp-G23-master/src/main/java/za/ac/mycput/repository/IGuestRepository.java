package za.ac.mycput.repository;
//Andisiwe Qhuva 218272510

import za.ac.mycput.domain.Guest;

import java.util.List;

public interface IGuestRepository extends IRepository<Guest, String>{
    List<Guest> getall();

    Guest update(String Name);
}

