package ru.netology.repositories;

import ru.netology.domian.MoviesData;

public class MoviesRepositories {
    private MoviesData[] movies = new MoviesData[0];

    public void save() { //  добавляет объект в массив
        MoviesData[] tmp = new MoviesData[movies.length +1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[movies.length] = movieAdd;
        tmp = movies;
    }

    public void findAll() { // возвращает массив всех хранящихся в массиве объектов

    }

    public void findById() { //  возвращает объект по идентификатору (либо null, если такого объекта нет)

    }

    public void removeById() { // удаляет объект по идентификатору (если объекта нет, то будет исключение)

    }

    public void remoteAll() { // полностью вычищает массив

    }
}
