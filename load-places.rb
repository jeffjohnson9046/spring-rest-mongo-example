require "net/http"
require "uri"
require "json"

uri = URI.parse("http://localhost:8080/places")

(1..200000).each do |i|
    req = Net::HTTP::Post.new(uri, initheader = { 'Content-Type' => 'application/json' })
    payload = { name: "Place #{i}",
        streetAddress:  "#{i} Street Name",
        city: "#{i % 1000} City",
        state: "#{i % 100} state",
        zip: "12345" }
    req.body = payload.to_json
    res = Net::HTTP.start(uri.hostname, uri.port) do |http|
        http.request(req)
    end
    puts "response: #{res.body}"
end