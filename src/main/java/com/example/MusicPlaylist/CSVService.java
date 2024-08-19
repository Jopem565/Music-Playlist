//package com.example.MusicPlaylist;

//import com.opencsv.CSVReader;
//import com.opencsv.CSVWriter;
//import org.springframework.stereotype.Service;
//
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.List;
//
//@Service
//public class CSVService {
//    public List<Song> readSongsFromCSV(String filePath) throws IOException {
//        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
//            return csvReader.readAll().stream().map(data -> new Song(null, data[0], data[1], data[2])).collect(Collectors.toList());
//        }
//    }
//
//    public void writeSongsToCSV(String filePath, List<Song> songs) throws IOException {
//        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(filePath))) {
//            for (Song song : songs) {
//                csvWriter.writeNext(new String[]{song.getTitle(), song.getArtist(), song.getDuration()});
//            }
//        }
//    }
//}