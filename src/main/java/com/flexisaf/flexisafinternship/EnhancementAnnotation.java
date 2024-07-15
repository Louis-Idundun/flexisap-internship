package com.flexisaf.flexisafinternship;


public @interface EnhancementAnnotation {
    String id();
    String synopsis();
    String engineer() default "unassigned";
    String date() default "unknown";
}

//metadata
@EnhancementAnnotation(
        id = "ENH-1234",
        synopsis = "Add feature to export data in CSV format",
        engineer = "Alice",
        date = "2024-05-16"
)
class DataExportEnhancement {
    // Class implementation
}