grammar Language; 

program: expression EOF;

expression: INT                                # int
          | expression ('*'|'/') expression    # mult
          | expression ('+'|'-') expression    # sum
          | '(' expression ')'                 # paren
          ;

INT: ('0'..'9')+;

Space: [ \t\n\r] -> skip; 
