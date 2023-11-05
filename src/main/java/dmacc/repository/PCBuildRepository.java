package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.PCBuild;

@Repository
public interface PCBuildRepository extends JpaRepository<PCBuild, Long>{

}
