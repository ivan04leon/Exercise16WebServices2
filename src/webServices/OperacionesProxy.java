package webServices;

public class OperacionesProxy implements webServices.Operaciones {
  private String _endpoint = null;
  private webServices.Operaciones operaciones = null;
  
  public OperacionesProxy() {
    _initOperacionesProxy();
  }
  
  public OperacionesProxy(String endpoint) {
    _endpoint = endpoint;
    _initOperacionesProxy();
  }
  
  private void _initOperacionesProxy() {
    try {
      operaciones = (new webServices.OperacionesServiceLocator()).getOperaciones();
      if (operaciones != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)operaciones)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)operaciones)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (operaciones != null)
      ((javax.xml.rpc.Stub)operaciones)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webServices.Operaciones getOperaciones() {
    if (operaciones == null)
      _initOperacionesProxy();
    return operaciones;
  }
  
  public int suma(int a, int b) throws java.rmi.RemoteException{
    if (operaciones == null)
      _initOperacionesProxy();
    return operaciones.suma(a, b);
  }
  
  public int resta(int a, int b) throws java.rmi.RemoteException{
    if (operaciones == null)
      _initOperacionesProxy();
    return operaciones.resta(a, b);
  }
  
  
}