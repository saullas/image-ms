package rsoapp.imagems.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ad_id")
    private Integer adId;

    @Column(name = "consecutive_number")
    private Integer consecutiveNumber;

    @Column(name = "height")
    private Integer height;

    @Column(name = "width")
    private Integer width;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "image")
    private Byte[] image;
}
