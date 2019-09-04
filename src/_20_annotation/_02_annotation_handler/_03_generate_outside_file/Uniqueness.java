package _20_annotation._02_annotation_handler._03_generate_outside_file;

public @interface Uniqueness {
    Constraints constraints()
        default @Constraints(unique=true);
}
