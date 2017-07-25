schema.propertyKey("name").Text().single().create()
schema.propertyKey('start_date').Date().create()
schema.propertyKey('end_date').Date().create()
schema.propertyKey('country').Text().multiple().properties('start_date','end_date').create()
schema.vertexLabel("author").properties("name", 'country').create()