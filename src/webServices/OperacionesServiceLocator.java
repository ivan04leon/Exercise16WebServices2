/**
 * OperacionesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webServices;

public class OperacionesServiceLocator extends org.apache.axis.client.Service implements webServices.OperacionesService {

    public OperacionesServiceLocator() {
    }


    public OperacionesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OperacionesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Operaciones
    private java.lang.String Operaciones_address = "http://localhost:8080/WebServiceProject/services/Operaciones";

    public java.lang.String getOperacionesAddress() {
        return Operaciones_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OperacionesWSDDServiceName = "Operaciones";

    public java.lang.String getOperacionesWSDDServiceName() {
        return OperacionesWSDDServiceName;
    }

    public void setOperacionesWSDDServiceName(java.lang.String name) {
        OperacionesWSDDServiceName = name;
    }

    public webServices.Operaciones getOperaciones() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Operaciones_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOperaciones(endpoint);
    }

    public webServices.Operaciones getOperaciones(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webServices.OperacionesSoapBindingStub _stub = new webServices.OperacionesSoapBindingStub(portAddress, this);
            _stub.setPortName(getOperacionesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOperacionesEndpointAddress(java.lang.String address) {
        Operaciones_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webServices.Operaciones.class.isAssignableFrom(serviceEndpointInterface)) {
                webServices.OperacionesSoapBindingStub _stub = new webServices.OperacionesSoapBindingStub(new java.net.URL(Operaciones_address), this);
                _stub.setPortName(getOperacionesWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Operaciones".equals(inputPortName)) {
            return getOperaciones();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webServices", "OperacionesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webServices", "Operaciones"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Operaciones".equals(portName)) {
            setOperacionesEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
