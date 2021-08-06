job('NodeJS example') {
    scm {
        git('git://https://github.com/aadi10894/Jenkins_DSL.git) {  node -> 
            node / gitConfigName('aadi10894')
            node / gitConfigEmail('aadithyabharadwaj1994@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
