grails {
	plugin {
		seed {
			root = 'src/seed'
			environment = null
			metaKey = 'meta'
			autoSeed = false
		}
	}
}

log4j = {
	error 'org.codehaus.groovy.grails',
			'org.springframework',
			'org.hibernate',
			'net.sf.ehcache.hibernate'
}
