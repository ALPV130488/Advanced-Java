/**
 * PersonServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soapexample.service;

public interface PersonServiceImpl extends java.rmi.Remote {
    public boolean addPerson(com.soapexample.beans.Person p) throws java.rmi.RemoteException;
    public boolean deletePerson(int id) throws java.rmi.RemoteException;
    public com.soapexample.beans.Person getPerson(int id) throws java.rmi.RemoteException;
    public com.soapexample.beans.Person[] getAllPersons() throws java.rmi.RemoteException;
}
