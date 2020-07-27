class Cluster {

    static String view(script)  {
        script.echo("YES")
        log.info 'Print'
    return script.env.PATH
    }

}

