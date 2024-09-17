package coderfromscratch.xmlrpcclientproject;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;

public class XmlRpcClientExample {
    public static void main(String[] args) {
        try {
            // Configure the XML-RPC client
            XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
            config.setServerURL(new URL("http://localhost:9000/")); // Server URL

            // Create an instance of XmlRpcClient
            XmlRpcClient client = new XmlRpcClient();
            client.setConfig(config);

            // Parameters for the method call
            Object[] params = {2, 3};

            // Call the 'add' method on the XML-RPC server
            Integer result = (Integer) client.execute("add", params);

            // Print the result
            System.out.println("Result of 2 + 3 is: " + result);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (XmlRpcException e) {
            e.printStackTrace();
        }
    }
}
