package de.thb.pricely.entity;
/*
 * Entity: User
 * Autor: Chin-Wen,Kao
 * Datum: 18.01.2022
 * Reference: Example Entity Spring Boot Project JustNoteIt from Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user")
@Builder
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String email;

	private String password;
	
	private boolean enabled;

	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<WishlistItem> wishlistItems;
}