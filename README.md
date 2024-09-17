# XMLRPC-Client MAVEN 


### Description

``
This a code to connect with a python XMLRPC Server (owned) .

***********Here is the code for the python Server:**************

from xmlrpc.server import SimpleXMLRPCServer


def add_numbers(a, b):
    return a + b

server = SimpleXMLRPCServer(('localhost', 9000))

print("Listening on port 9000...")

server.register_function(add_numbers, 'add')

server.serve_forever()
``
