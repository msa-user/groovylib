def call(String name = 'human') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Hello, ${name}."
    String tt=Cluster.view(this)
    echo "Yo, ${tt}"
}
