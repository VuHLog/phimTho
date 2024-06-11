package com.iflix.iflix.DAO;

import com.iflix.iflix.Entities.Episodes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EpisodesRepository extends JpaRepository<Episodes, String> {

    Episodes findByEpisodeNumber(int episodeNumber);

    Page<Episodes> findAllByEpisodeNumber(int episodeNumber, Pageable pageable);

    Page<Episodes> findAllByMovie_Id(String movieId, Pageable pageable);

    @Modifying
    @Query(value = "DELETE e from episodes as e where e.movie_id = :movieId",nativeQuery = true)
    void deleteByMovieId(String movieId);
}