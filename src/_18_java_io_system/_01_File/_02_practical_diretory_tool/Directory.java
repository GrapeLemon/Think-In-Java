//package _18_java_io_system._01_File._02_practical_diretory_tool;
//
//import sun.reflect.generics.tree.Tree;
//
//import java.io.File;
//import java.io.FilenameFilter;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.regex.Pattern;
//
///**
// * @author lwx
// * @date 2019/9/8-18:07
// */
//public final class Directory {
//    public static File[]
//    local(File dir, final String regex) {
//        return dir.listFiles(new FilenameFilter() {
//            private Pattern pattern = Pattern.compile(regex);
//            @Override
//            public boolean accept(File dir, String name) {
//                return pattern.matcher(
//                    new File(name).getName()).matches();
//            }
//        });
//    }
//    public static File[]
//    local(String path, final String regex) {    // Overloaded
//        return local(new File(path), regex);
//    }
//
//    // A two-tuple for returning a pair of objects:
//    public static class TreeInfo implements Iterable<File> {
//        public List<File> files = new ArrayList<>();
//        public List<File> dirs = new ArrayList<>();
//
//        // The default iterable element is the file list:
//        @Override
//        public Iterator<File> iterator() {
//            return files.iterator();
//        }
//
//        void addAll(TreeInfo other) {
//            files.addAll(other.files);
//            dirs.addAll(other.dirs);
//        }
//
//        public String toString() {
//            return "dirs: " + PPrint.pformat(dirs) +
//                    "\n\nfiles: " + PPrint.pformat(files);
//        }
//
//        public static TreeInfo
//        
//    }
//}
