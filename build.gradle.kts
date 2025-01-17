plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.9.0"
}

/*compileJava {
    options.compilerArgs += ["-Xlint"]
}*/

repositories {
    mavenLocal()
    mavenCentral()
}

group = "gitflow4idea-plus"
version = "0.7.11"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}

intellij {
    version.set("2022.2.1")
    plugins.set(listOf("git4idea", "tasks"))
    updateSinceUntilBuild.set(false)
}

tasks {
    patchPluginXml {
        pluginId.set("Gitflow-Fix")
        pluginDescription.set("""
            <H2>Git Flow Integration for Intellij</H2>
            An intelliJ plugin providing a UI layer for git-flow, which in itself is a collection of Git extensions to provide high-level repository operations for Vincent <a href="http://nvie.com/git-model">Driessen's branching model</a>
        """)
        version.set("${project.version}")
        sinceBuild.set("222.3739.54")
        changeNotes.set("""
            <H2>Changelog for 0.7.11</H2>
            <ul>
              <li>Fix "Access is allowed from event dispatch thread only" #17 #21 #19 </li>
            </ul>
            
            <H2>Changelog for 0.7.10</H2>
            <ul>
              <li>Fix "Error during startup" #4</li>
            </ul>
        
            <H2>Changelog for 0.7.9</H2>
            <ul>
              <li>Support for 2022.1 build</li>
            </ul>
        
            <H2>Changelog for 0.7.8</H2>
            <ul>
              <li>Support for 2021.3 build</li>
            </ul>
        
            <H2>Changelog for 0.7.7</H2>
            <ul>
              <li>Fix issue with "Unsupported gitflow version" message presented at startup #328 #329</li>
              <li>Support for 2021.2 build</li>
            </ul>
        
            <H2>Changelog for 0.7.6</H2>
            <ul>
              <li>Fix "Error using shortcuts" #322</li>
              <li>fix Finishing BugFix throws stacktrace #320</li>
              <li>Support for 2021.1 build</li>
            </ul>
        
            <H2>Changelog for 0.7.5</H2>
            <ul>
              <li>PluginException: Icon cannot be found in 'AllIcons.Vcs.CheckOut' #314 (@tumb1er)</li>
              <li>Support for 2020.3 build</li>
            </ul>
        
            <H2>Changelog for 0.7.4</H2>
            <ul>
              <li>Fix deprecations #298 (@fabmars)</li>
              <li>Support for 2020.2 build</li>
            </ul>
        
            <H2>Changelog for 0.7.3</H2>
            <ul>
              <li>Implemented sorting and filtering of track branch dialog #290 (@mmopitz)</li>
              <li>Fix Version 0.7.2 causes that Active Tool Windows only is showed in one project if you have several open #301 (@tumb1er)</li>
              <li>Fix Unsupported Git Flow version Fix #302 (@opherv)</li>
              <li>Fix init settings shown in UI are misleading (do not match default) #283 (@opherv)</li>
            </ul>
        
            <H2>Changelog for 0.7.2</H2>
            <ul>
              <li>Support for Idea build 200 #276 (@fabmars, @tumb1er )</li>
              <li>Fix Icon cannot be found in 'AllIcons.Vcs.' #286 (@fabmars)</li>
              <li>Fix finish release error (Mac OS) #273 (@opherv)</li>
              <li>Breaking 'Search Everywhere' dialog window for projects without git #265 (@opherv)</li>
            </ul>
        
            <H2>Changelog for 0.7.1</H2>
            <ul>
              <li>Support for Idea build 193 #259 (@opherv)</li>
              <li>Check that the user has AVH version of git flow installed, show dialog otherwise #253 (@opherv)</li>
              <li>Add safety which should help fix #249 - Init repo failed #259 (@opherv)</li>
              <li>Fix Memory leak of ProjectImpl and GitRepositoryImpl after projet is closed #255 (@opherv)</li>
              <li>Add icons to actions #232 (@opherv)</li>
            </ul>
        
            <H2>Changelog for 0.7.0</H2>
            <ul>
              <li>Fix NPE when clicking Gitflow menu #245 (@opherv)</li>
              <li>Fix "Init gitflow" doesn't update widget #247 (@opherv)</li>
              <li>Fix Wrong message when finishing a feature #144 (@opherv)</li>
              <li>Feature: Re-init gitflow (access from VCS>Git>Gitflow>Advanced menu) #50 (@bmwsedee/@opherv)</li>
              <li>"Feature": Don't show branch select combo on new Hotfix (@opherv)</li>
            </ul>
        
            <H2>Changelog for 0.6.9</H2>
            <ul>
              <li>Support for Idea build 192 #241 (@opherv)</li>
              <li>Feature: No Fast-forward option is not working #225 (@opherv)</li>
              <li>Hotfix: option -k to keep branch after performing finish #199 (@opherv)</li>
              <li>Exceptions #243 #235 #323 #223 (@bmwsedee)</li>
            </ul>
        
            <H2>Changelog for 0.6.8</H2>
            <ul>
              <li>Support for Idea build 191 #221 (@ottnorml)</li>
              <li>Fix performance issues in plugin #195 (@bmwsedee)</li>
            </ul>
        
            <p>Note - if you see 'no gitflow' in the status bar you will need to re-init using <code>git flow init -f</code></p>
        """)
    }
}
