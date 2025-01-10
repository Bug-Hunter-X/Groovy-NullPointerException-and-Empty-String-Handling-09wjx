```groovy
def myMethod(String str) {
  if (str == null) {
    return "Null String"
  } else if (str.isEmpty()) {
    return "Empty String"
  } else {
    return "Non-empty String: "+ str
  }
}

println myMethod(null)
println myMethod("")
println myMethod("Hello")
```