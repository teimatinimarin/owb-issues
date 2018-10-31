#### Java Version
OpenJDK 11
```
wb-issues teimatinim$ java --version
openjdk 11.0.1 2018-10-16
OpenJDK Runtime Environment 18.9 (build 11.0.1+13)
OpenJDK 64-Bit Server VM 18.9 (build 11.0.1+13, mixed mode)
```

#### Compilation
mvn package... this will create a ready to run distribution under ./owb-issues.distribution/target/owb-issues.distribution-1.0-SNAPSHOT-dist
```
teimatinim$ mvn package
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] owb-issues                                                         [pom]
[INFO] owb-issues.main                                                    [jar]
[INFO] Distribution                                                       [pom]
[INFO] 
[INFO] ------------------------< com.beuwa:owb-issues >------------------------
[INFO] Building owb-issues 1.0-SNAPSHOT                                   [1/3]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] ---------------------< com.beuwa:owb-issues.main >----------------------
[INFO] Building owb-issues.main 1.0-SNAPSHOT                              [2/3]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ owb-issues.main ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ owb-issues.main ---
[INFO] Required filename-based automodules detected. Please don't publish this project to a public artifact repository!
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 5 source files to /Users/teimatinim/git/concepts/owb-issues/owb-issues.main/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ owb-issues.main ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.0:testCompile (default-testCompile) @ owb-issues.main ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.0:test (default-test) @ owb-issues.main ---
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ owb-issues.main ---
[INFO] Building jar: /Users/teimatinim/git/concepts/owb-issues/owb-issues.main/target/owb-issues.main-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-dependency-plugin:3.1.1:copy-dependencies (copy-dependencies) @ owb-issues.main ---
[INFO] Copying cdi-api-2.0.jar to /Users/teimatinim/git/concepts/owb-issues/owb-issues.main/target/lib/cdi-api-2.0.jar
[INFO] Copying javax.el-api-3.0.0.jar to /Users/teimatinim/git/concepts/owb-issues/owb-issues.main/target/lib/javax.el-api-3.0.0.jar
[INFO] Copying javax.interceptor-api-1.2.jar to /Users/teimatinim/git/concepts/owb-issues/owb-issues.main/target/lib/javax.interceptor-api-1.2.jar
[INFO] Copying javax.inject-1.jar to /Users/teimatinim/git/concepts/owb-issues/owb-issues.main/target/lib/javax.inject-1.jar
[INFO] Copying javax.annotation-api-1.3.2.jar to /Users/teimatinim/git/concepts/owb-issues/owb-issues.main/target/lib/javax.annotation-api-1.3.2.jar
[INFO] Copying openwebbeans-se-2.0.7.jar to /Users/teimatinim/git/concepts/owb-issues/owb-issues.main/target/lib/openwebbeans-se-2.0.7.jar
[INFO] Copying openwebbeans-impl-2.0.7.jar to /Users/teimatinim/git/concepts/owb-issues/owb-issues.main/target/lib/openwebbeans-impl-2.0.7.jar
[INFO] Copying xbean-finder-shaded-4.9.jar to /Users/teimatinim/git/concepts/owb-issues/owb-issues.main/target/lib/xbean-finder-shaded-4.9.jar
[INFO] Copying xbean-asm6-shaded-4.9.jar to /Users/teimatinim/git/concepts/owb-issues/owb-issues.main/target/lib/xbean-asm6-shaded-4.9.jar
[INFO] Copying openwebbeans-spi-2.0.7.jar to /Users/teimatinim/git/concepts/owb-issues/owb-issues.main/target/lib/openwebbeans-spi-2.0.7.jar
[INFO] 
[INFO] -----------------< com.beuwa:owb-issues.distribution >------------------
[INFO] Building Distribution 1.0-SNAPSHOT                                 [3/3]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- maven-assembly-plugin:2.2-beta-5:single (distro-assembly) @ owb-issues.distribution ---
[INFO] Reading assembly descriptor: src/assembly/dist.xml
[INFO] Copying files to /Users/teimatinim/git/concepts/owb-issues/owb-issues.distribution/target/owb-issues.distribution-1.0-SNAPSHOT-dist
[WARNING] Assembly file: /Users/teimatinim/git/concepts/owb-issues/owb-issues.distribution/target/owb-issues.distribution-1.0-SNAPSHOT-dist is not a regular file (it may be a directory). It cannot be attached to the project build for installation or deployment.
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO] 
[INFO] owb-issues 1.0-SNAPSHOT ............................ SUCCESS [  0.005 s]
[INFO] owb-issues.main .................................... SUCCESS [  2.339 s]
[INFO] Distribution 1.0-SNAPSHOT .......................... SUCCESS [  0.591 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.043 s
[INFO] Finished at: 2018-10-31T17:30:32-06:00
[INFO] ------------------------------------------------------------------------
```

#### ChangeDir to distribution folder
teimatinim$ cd ./owb-issues.distribution/target/owb-issues.distribution-1.0-SNAPSHOT-dist

#### Give execution permission to sh files
teimatinim$ chmod 700 entrypoint*

#### Final Explanation
two sh ready to run...

##### entrypoint-classpath.sh:
This file execute the sample project by using -classpath instead of modules. This works fine!
```
teimatinim$ ./entrypoint-classpath.sh 
Oct 31, 2018 5:35:55 PM org.apache.webbeans.lifecycle.AbstractLifeCycle bootstrapApplication
INFO: OpenWebBeans Container is starting...
Oct 31, 2018 5:35:55 PM org.apache.webbeans.corespi.scanner.AbstractMetaDataDiscovery addWebBeansXmlLocation
INFO: added beans archive URL: jar:file:/Users/teimatinim/git/concepts/owb-issues/owb-issues.distribution/target/owb-issues.distribution-1.0-SNAPSHOT-dist/lib/cdi-api-2.0.jar!/
Oct 31, 2018 5:35:55 PM org.apache.webbeans.corespi.scanner.AbstractMetaDataDiscovery addWebBeansXmlLocation
INFO: added beans archive URL: jar:file:/Users/teimatinim/git/concepts/owb-issues/owb-issues.distribution/target/owb-issues.distribution-1.0-SNAPSHOT-dist/bin/owb-issues.main-1.0-SNAPSHOT.jar!/
Oct 31, 2018 5:35:55 PM org.apache.webbeans.config.BeansDeployer validateInjectionPoints
INFO: All injection points were validated successfully.
Oct 31, 2018 5:35:55 PM org.apache.webbeans.lifecycle.AbstractLifeCycle bootstrapApplication
INFO: OpenWebBeans Container has started, it took [145] ms.
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.apache.webbeans.proxy.AbstractProxyFactory (file:/Users/teimatinim/git/concepts/owb-issues/owb-issues.distribution/target/owb-issues.distribution-1.0-SNAPSHOT-dist/lib/openwebbeans-impl-2.0.7.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int)
WARNING: Please consider reporting this to the maintainers of org.apache.webbeans.proxy.AbstractProxyFactory
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
Init...
```

##### entrypoint.sh
This file executes the sample project using the module system (jigsaw). This one fails.
```
teimatinim$ ./entrypoint.sh 
Oct 31, 2018 5:37:17 PM org.apache.webbeans.lifecycle.AbstractLifeCycle bootstrapApplication
INFO: OpenWebBeans Container is starting...
Oct 31, 2018 5:37:17 PM org.apache.webbeans.corespi.scanner.AbstractMetaDataDiscovery addWebBeansXmlLocation
INFO: added beans archive URL: jar:file:///Users/teimatinim/git/concepts/owb-issues/owb-issues.distribution/target/owb-issues.distribution-1.0-SNAPSHOT-dist/./lib/cdi-api-2.0.jar!/
Oct 31, 2018 5:37:17 PM org.apache.webbeans.corespi.scanner.AbstractMetaDataDiscovery addWebBeansXmlLocation
INFO: added beans archive URL: jar:file:///Users/teimatinim/git/concepts/owb-issues/owb-issues.distribution/target/owb-issues.distribution-1.0-SNAPSHOT-dist/./bin/owb-issues.main-1.0-SNAPSHOT.jar!/
Oct 31, 2018 5:37:18 PM org.apache.webbeans.config.BeansDeployer validateInjectionPoints
INFO: All injection points were validated successfully.
Oct 31, 2018 5:37:18 PM org.apache.webbeans.lifecycle.AbstractLifeCycle bootstrapApplication
INFO: OpenWebBeans Container has started, it took [139] ms.
Exception in thread "main" java.lang.NullPointerException
        at openwebbeans.impl@2.0.7/org.apache.webbeans.proxy.AbstractProxyFactory.unsafeDefineClass(AbstractProxyFactory.java:437)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.proxy.AbstractProxyFactory.defineAndLoadClass(AbstractProxyFactory.java:409)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.proxy.AbstractProxyFactory.createProxyClass(AbstractProxyFactory.java:255)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.proxy.AbstractProxyFactory.createProxyClass(AbstractProxyFactory.java:229)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.proxy.NormalScopeProxyFactory.createProxyClass(NormalScopeProxyFactory.java:271)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.proxy.NormalScopeProxyFactory.createProxyClass(NormalScopeProxyFactory.java:200)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.proxy.NormalScopeProxyFactory.createNormalScopeProxy(NormalScopeProxyFactory.java:149)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.container.BeanManagerImpl.getReference(BeanManagerImpl.java:791)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.container.BeanManagerImpl.getInjectableReference(BeanManagerImpl.java:687)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.inject.AbstractInjectable.inject(AbstractInjectable.java:100)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.inject.InjectableField.doInjection(InjectableField.java:65)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.portable.InjectionTargetImpl.injectFields(InjectionTargetImpl.java:227)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.portable.InjectionTargetImpl.inject(InjectionTargetImpl.java:213)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.portable.InjectionTargetImpl.inject(InjectionTargetImpl.java:203)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.component.AbstractOwbBean.create(AbstractOwbBean.java:126)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.component.ManagedBean.create(ManagedBean.java:66)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.context.creational.BeanInstanceBag.create(BeanInstanceBag.java:76)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.context.AbstractContext.getInstance(AbstractContext.java:159)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.context.AbstractContext.get(AbstractContext.java:125)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.event.ObserverMethodImpl.notify(ObserverMethodImpl.java:329)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.event.NotificationManager.invokeObserverMethod(NotificationManager.java:854)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.event.NotificationManager.fireEvent(NotificationManager.java:750)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.container.BeanManagerImpl.fireEvent(BeanManagerImpl.java:495)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.container.BeanManagerImpl.fireEvent(BeanManagerImpl.java:469)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.container.BeanManagerImpl.fireEvent(BeanManagerImpl.java:453)
        at openwebbeans.impl@2.0.7/org.apache.webbeans.container.InjectableBeanManager.fireEvent(InjectableBeanManager.java:109)
        at redwine.sensor/com.beuwa.redwine.sensor.Main.main(Main.java:24)
```

# FINAL NOTE
If I remove the @ApplicationScoped from Initializer class, compile and run the sample again, it works!!!

So... somehow, the issue is related with this @ApplicationScoped annotation and the JigSaw component in Java 11.
