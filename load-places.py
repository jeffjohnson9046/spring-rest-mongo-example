import json
import urllib2

for i in xrange(100000):
    payload = {
        'name': "Python Place %d" %i,
        'streetAddress':  "%d Street Name" %i,
        'city': "%d City" %(i % 1000),
        'state': "%d state" %(i % 100),
        'zip': "12345" }

    print("payload: ", json.dumps(payload))

    req = urllib2.Request('http://localhost:8080/places')
    req.add_header('Content-Type', 'application/json')

    response = urllib2.urlopen(req, json.dumps(payload))
    print("response code: %d" %response.code)
    response.close()
