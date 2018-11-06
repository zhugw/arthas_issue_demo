# arthas_issue_demo
demo for reproduce an issue of Arthas

# Reproduce step

1. Start this app
mvn spring-boot:run

2. Start Arthas
./as.sh
$ watch com.example.demo.FooController foo "{params[0].headers}" -x 2

3. Call Api
➜  curl 'http://localhost:8080/foo?name=aaa'

Source code
```
    @GetMapping("/foo")
    public Object foo(HttpServletRequest request, @RequestParam String name) {
        return "Hello " + name;
    }
```

