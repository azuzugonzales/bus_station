package com.bus_station.hibernate.dao;

import com.bus_station.hibernate.logic.Bus;
import com.bus_station.hibernate.logic.Driver;
import com.bus_station.hibernate.logic.Route;

import java.sql.SQLException;
import java.util.Collection;

public class BusDAO {
    public void addBus(Bus bus) throws SQLException;
    public void updateBus(Long bus_id, Bus bus) throws SQLException;
    public Bus getBusById(Long bus_id) throws SQLException;
    public Collection getAllBusses() throws SQLException;
    public void deleteBus(Bus bus) throws SQLException;
    public Collection getBussesByDriver(Driver driver) throws SQLException;
    public Collection getBussesByRoute(Route route) throws SQLException;
}
