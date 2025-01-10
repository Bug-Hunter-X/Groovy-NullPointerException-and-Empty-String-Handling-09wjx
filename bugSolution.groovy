```groovy
def myMethod(String str) {
  // Use Groovy's safe navigation operator (?.) and elvis operator (?:)
  return str?.toString() ?: "Empty String"
}

println myMethod(null)
println myMethod("")
println myMethod("Hello")

// Alternatively, for more explicit handling:

def myMethod2(String str) {
  if (str == null || str.isEmpty()) {
    return "Empty or Null String"
  } else {
    return "Non-empty String: "+ str
  }
}

println myMethod2(null)
println myMethod2("")
println myMethod2("Hello")
```